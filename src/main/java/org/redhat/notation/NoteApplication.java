/**
 *  Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.redhat.notation;

public class NoteApplication {

  
	private Bilan bilan;
    private Notation notation;
    
    
    public NoteApplication(){

    }

	public NoteApplication(Bilan bilan, boolean noted) {
		this.bilan = bilan;
	}


    /**
     * @return Bilan return the bilan
     */
    public Bilan getBilan() {
        return bilan;
    }

    /**
     * @param bilan the bilan to set
     */
    public void setBilan(Bilan bilan) {
        this.bilan = bilan;
    }


	@Override
	public String toString() {
		return "NoteApplication [ bilan=" + bilan + "]";
	}

    /**
     * @return Notation return the notation
     */
    public Notation getNotation() {
        return notation;
    }

    /**
     * @param notation the notation to set
     */
    public void setNotation(Notation notation) {
        this.notation = notation;
    }

}
