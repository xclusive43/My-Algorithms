 //Ajay Prajapati Software Engineer at Primary Healthtech
 private void receive(byte[] data) { //todo: in this function i am facing problem while converting byte data to either Sting or any Other datatype

        String  aa;

        aa = new String(data);

        if (aa.contains("r")){
            Display("SYSTEM IS READY PLEASE PRESS DONE....\n");
            abst = true;//todo: making absorbance statements to be open for the first time
            donebtn.setVisibility(View.VISIBLE);
            return;
        }

       else if(aa.contains("D"))
        {

            if(timeout<11){
                String bb = null;
                try {
                    bb = new String(data,"UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                String a11 = bb.replaceAll("[A-Z a-z]","");
                if (intnotin){
                    rawval2 = rawval1.concat(a11);
                    if (rawval2.length()>5){ 
                        rawval2="";
                        rawval1 ="";
                    }
                  else  {
                      if (rawval2.length()==0){
                          return;
                      }
                       else{ 
                           timeout=timeout+1;
                        int rawint= Integer.parseInt(rawval2);
                        raw.add(rawint);
                        intnotin =false;
                        rawval1 ="";
                        rawval2 = "";}

                    }
                }
                else {
                    if (a11.length()==0){

                        return;
                    }
                    else {
                        timeout=timeout+1;
                        int a1;
                        a1 = Integer.parseInt(a11);
                        raw.add(a1);
                    }

                }
                send("a");

            }
            else{
                timeout = 0;
               
               reading();
//                if(sec90 || sec180){
//                    reading(raw);
//                }
//                else {
//                    CV(raw);
//                }


            }


        }
        else{
            //Display("not int :"+aa+"\n");
            rawval1 = aa;
            intnotin = true;

        }




    }
