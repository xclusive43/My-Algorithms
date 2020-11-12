private void receive(byte[] data) { //todo: in this function i am facing problem while converting byte data to either Sting or any Other datatype
        String  aa = new String(data);
        Toast.makeText(getContext(), aa, Toast.LENGTH_SHORT).show();
        if(aa.contains("r")){
            receiveText.append("ready\n");
            wait =true;
            send("a");
            return;
        }
        if(wait){

            timeout++;
            if (timeout<=10){
                //Toast.makeText(getContext(), "working1", Toast.LENGTH_SHORT).show();
                String data1 = new String(data);
                if(data1.isEmpty()){
                    return;
                }
                arraycounter +=1;
                int a1 = Integer.valueOf(new String(data));
                String  a= null;

                try {
                    a = new String(data,"utf-8");

                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                Toast.makeText(getContext(), a, Toast.LENGTH_SHORT).show();
                a1 = Integer.parseInt(a);
                receiveText.append("int : "+a1+"\n");
                raw.add(a1);

                send("a");
            }



        }

 
    }
