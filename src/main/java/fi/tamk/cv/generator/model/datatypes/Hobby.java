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

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Hobby extends DataType{
    private String type;
    private String name;
    private String description;
    private LocalDate startdate;
    private LocalDate enddate;

    public Hobby(String name, String description, LocalDate startdate, LocalDate enddate) {
        super("hobby");
        this.name = name;
        this.description = description;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Hobby(long id, boolean visible, String name, String description, LocalDate startdate, LocalDate enddate) {
        super("hobby", id, visible);
        this.name = name;
        this.description = description;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public List<String> toList(){
        return Arrays.asList(getType(),""+getId(),""+isVisible(),getName(),getDescription(),
                getStartdate().format(formatter),getEnddate().format(formatter));
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

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }
}
