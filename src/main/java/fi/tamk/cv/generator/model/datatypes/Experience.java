/*
Copyright 2019 Hanna Haataja <hanna.haataja@tuni.fi>. All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following
disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
disclaimer in the documentation and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package fi.tamk.cv.generator.model.datatypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Experience extends DataType {
    Logger log = LoggerFactory.getLogger(this.getClass());
    private LocalDate startdate;
    private LocalDate enddate;
    private String title;
    private String name;
    private String description;
    private int[] achievements;

    public Experience() {
        super();
    }

    public Experience(String type, LocalDate startdate, LocalDate enddate, String title, String name, String description, int[] achievements) {
        super(type);
        this.startdate = startdate;
        this.enddate = enddate;
        this.title = title;
        this.name = name;
        this.description = description;
        this.achievements = achievements;
    }

    public Experience(String type, long id, boolean visible, LocalDate startdate, LocalDate enddate, String title, String name, String description, int[] achievements) {
        super(type, id, visible);
        this.startdate = startdate;
        this.enddate = enddate;
        this.title = title;
        this.name = name;
        this.description = description;
        this.achievements = achievements;
    }

    public Experience(String type, long id, boolean visible, LocalDate startdate, LocalDate enddate, String title, String name, String description) {
        super(type, id, visible);
        this.startdate = startdate;
        this.enddate = enddate;
        this.title = title;
        this.name = name;
        this.description = description;
    }

    public List<Object> toList() {
        List<Object> list = new ArrayList<>();
        list.add(getType());
        list.add(getId());
        list.add(isVisible());
        list.add(getStartdate() == null ? "" : getStartdate().format(formatter));
        list.add(getEnddate() == null ? "" : getEnddate().format(formatter));
        list.add(getTitle() == null ? "" : getTitle());
        list.add(getName() == null ? "" : getName());
        list.add(getDescription() == null ? "" : getDescription());
        if (achievements != null && achievements.length != 0) {
            for (int i : achievements) {
                list.add(i);
            }
        }

        return list;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public void setStartdate(String stardate) {
        this.startdate = LocalDate.parse(stardate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = LocalDate.parse(enddate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getAchievements() {
        return achievements;
    }

    public void setAchievements(int[] achievements) {
        this.achievements = achievements;
    }
}
