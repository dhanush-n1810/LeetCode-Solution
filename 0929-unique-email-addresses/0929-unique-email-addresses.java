class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet <String> hs  = new HashSet<>();
        for(String email : emails){
            int split_pos = email.indexOf("@");
            String local_name = email.substring(0,split_pos);
            String domain_name = email.substring(split_pos);
            if(local_name.contains("+")){
                int plus_pos = local_name.indexOf("+");
                local_name = local_name.substring(0,plus_pos);

            }
            local_name = local_name.replace(".", "");
            String new_name = local_name + domain_name;
            hs.add(new_name);

        }
        return hs.size();
        
    }
}