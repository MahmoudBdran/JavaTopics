package com.example.JavaNotToForget;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ParseJsonWithGroovy extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:myTimer?repeatCount=1")
                .setBody().simple(
                        "{\n" +
                                "\t\"version\": 1,\n" +
                                "\t\"inputs\": [\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"APPROVAL_NO_\",\n" +
                                "\t\t\t\"value\": \"324\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"PROCESSOR_TIME_IN_\",\n" +
                                "\t\t\t\"value\": \"06/08/2022 14:41:49 AST\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"CLINIC_CODE_\",\n" +
                                "\t\t\t\"value\": \"\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"IN_OUT_PATIENT_\",\n" +
                                "\t\t\t\"value\": \"O\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"DOCTOR_NAME_\",\n" +
                                "\t\t\t\"value\": \"\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"PROCESSED_BY_\",\n" +
                                "\t\t\t\"value\": \"\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"TOT_REQ_COST_\",\n" +
                                "\t\t\t\"value\": 216000\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"DOCTOR_CODE_\",\n" +
                                "\t\t\t\"value\": \"0\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"POLICY_NO_\",\n" +
                                "\t\t\t\"value\": \"202220231\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"LOSS_DATE_\",\n" +
                                "\t\t\t\"value\": \"05/04/2022 00:00:00 AST\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"APPROVAL_STATUS_\",\n" +
                                "\t\t\t\"value\": \"U\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"EST_L_OF_STAY_\",\n" +
                                "\t\t\t\"value\": 36\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"NOTES_\",\n" +
                                "\t\t\t\"value\": \"\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"MEMBER_CODE_\",\n" +
                                "\t\t\t\"value\": \"001102296868001\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"PROVIDER_ID_\",\n" +
                                "\t\t\t\"value\": \"528244\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"BENEFIT_CATEGORY_\",\n" +
                                "\t\t\t\"value\": 1\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"INCOMING_DATE_\",\n" +
                                "\t\t\t\"value\": \"06/08/2022 14:41:48 AST\"\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"APP_ICD_\",\n" +
                                "\t\t\t\"value\": \"[{\\\"metadata\\\":[{\\\"CREATION_DATE\\\":\\\"string\\\"},{\\\"ICD_CODE\\\":\\\"string\\\"},{\\\"RECEIVED_CODE\\\":\\\"string\\\"},{\\\"APPROVAL_NO\\\":\\\"string\\\"},{\\\"MAIN_DIAGNOSIS\\\":\\\"string\\\"},{\\\"DIAGNOSIS_FREE_DESC\\\":\\\"string\\\"}]},{\\\"data\\\":[[\\\"05/22/2023 14:41:48 AST\\\",\\\"c41.9\\\",null,\\\"59357277\\\",\\\"Y\\\",\\\"Pain, unspecified\\\"]]}]\"\n" +
                                "\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"APPROVAL_DETAILS_\",\n" +
                                "\t\t\t\"value\": \"[{\\\"metadata\\\":[{\\\"APPROVAL_NO\\\":\\\"string\\\"},{\\\"CREATION_DATE\\\":\\\"string\\\"},{\\\"QUANTITY\\\":\\\"decimal\\\"},{\\\"SERVICE_REQUEST_COST\\\":\\\"decimal\\\"},{\\\"SERVICE_APPROV_COST\\\":\\\"decimal\\\"},{\\\"STATUS\\\":\\\"string\\\"},{\\\"REJECT_REASON\\\":\\\"string\\\"},{\\\"RECIEVED_CODE\\\":\\\"string\\\"},{\\\"SERVICE_FREE_DESC\\\":\\\"string\\\"},{\\\"APPROVED_QUANTITY\\\":\\\"decimal\\\"},{\\\"PBM_SERVICE_STATUS\\\":\\\"string\\\"},{\\\"PBM_SERVICE_DENIAL_COMMENTS\\\":\\\"string\\\"},{\\\"PBM_DRUGSUPPLY_DURATION\\\":\\\"decimal\\\"},{\\\"PBM_DRUGSUPPLY_UNIT\\\":\\\"string\\\"},{\\\"TOOTH_NUMBER\\\":\\\"decimal\\\"},{\\\"SERVICE_TYPE\\\":\\\"string\\\"},{\\\"SERVICE_CODE\\\":\\\"string\\\"},{\\\"SERVICE_DATE\\\":\\\"string\\\"},{\\\"DURATION\\\":\\\"decimal\\\"},{\\\"DOSAGE\\\":\\\"string\\\"},{\\\"ADDITIONAL_DETAIL_INFO\\\":\\\"string\\\"}]},{\\\"data\\\":[[\\\"59357277\\\",\\\"05/22/2023 14:10:46 AST\\\",1,1,null,\\\"U\\\",null,\\\"99999999999993\\\",\\\"acetaminophen 350mg supp\\\",null,null,null,null,null,null,null,\\\"146965\\\",\\\"05/12/2023 00:00:00 AST\\\",null,null,null],[\\\"59357277\\\",\\\"05/22/2023 14:10:46 AST\\\",1,14.75,null,\\\"U\\\",null,\\\"05415062000953\\\",\\\"azithromycin cap 250mg\\\",null,null,null,null,null,null,null,\\\"146966\\\",\\\"05/12/2023 00:00:00 AST\\\",null,null,null],[\\\"59357277\\\",\\\"05/22/2023 14:10:46 AST\\\",1,0.5,null,\\\"U\\\",null,\\\"99999999999999\\\",\\\"cefepime 40 mg / 1 mL Injection\\\",null,null,null,null,null,null,null,\\\"146921\\\",\\\"05/12/2023 00:00:00 AST\\\",null,null,null],[\\\"59357277\\\",\\\"05/22/2023 14:10:46 AST\\\",1,1,null,\\\"U\\\",null,\\\"99999999999993\\\",\\\"VITAMIN D\\\",null,null,null,null,null,null,null,\\\"146922\\\",\\\"05/12/2023 00:00:00 AST\\\",null,null,null]]}]\"\n" +
                                "\n" +
                                "\t\t},\n" +
                                "\t\t{\n" +
                                "\t\t\t\"name\": \"ACCESS_TOKEN_\",\n" +
                                "\t\t\t\"value\": \"eyJhbGciOiJSUzI1NiIsImprdSI6Imh0dHBzOi8vbG9jYWxob3N0L1NBU0xvZ29uL3Rva2VuX2tleXMiLCJraWQiOiJsZWdhY3ktdG9rZW4ta2V5IiwidHlwIjoiSldUIn0.eyJqdGkiOiJhZGMwZjI1NTA2ODk0NDFiYjYwYjZiZDY5YTE5NTEzMyIsInN1YiI6InNhcy5hZG1pbiIsImF1dGhvcml0aWVzIjpbImNsaWVudHMucmVhZCIsImNsaWVudHMuc2VjcmV0IiwidWFhLnJlc291cmNlIiwiY2xpZW50cy53cml0ZSIsInVhYS5hZG1pbiIsImNsaWVudHMuYWRtaW4iLCJzY2ltLndyaXRlIiwic2NpbS5yZWFkIl0sInNjb3BlIjpbInVhYS5hZG1pbiJdLCJjbGllbnRfaWQiOiJzYXMuYWRtaW4iLCJjaWQiOiJzYXMuYWRtaW4iLCJhenAiOiJzYXMuYWRtaW4iLCJncmFudF90eXBlIjoiY2xpZW50X2NyZWRlbnRpYWxzIiwicmV2X3NpZyI6ImM3NjM5NmRmIiwiaWF0IjoxNjU0Njg4MTUzLCJleHAiOjE2NTQ3MDI1NTMsImlzcyI6Imh0dHA6Ly9sb2NhbGhvc3QvU0FTTG9nb24vb2F1dGgvdG9rZW4iLCJ6aWQiOiJ1YWEiLCJhdWQiOlsic2FzLioiLCJ1YWEiLCJzYXMuYWRtaW4iXX0.lHgVRnksDuO6tu9q1IlS-1vD8Vj2Dmrki-HKRhFADedTtF5CIOGCSumLO9cEQ6PEG5Lq7-A_HMni5ZRU8VfFJ5JqADNjdQ_rxuFnKecv8H6BRDQ3fUgcX06yDHF5WreBf_t-gCcUO57uFXlD52Y9jVCpwarfyah0nqPrSKnYsvsKzBcNAocamQWhuxyPPdjA6PXnofwqfDmaS7byw6KpxfQ6ft1gIgPRS0jF2pjY-Uac9SjIP_uQoeqpK4RO0cwYjDYgZcY04ICq2yLj9bBTOjejSRkU6pDygpteK2QvlZ9422hw4O0N0Z0SgBj_vCsnviQpWS3PYSnB-wv5DiLDzw\"\n" +
                                "\t\t}\n" +
                                "\t]\n" +
                                "}"
                )
                .process(new Processor() {
                    @Override
                   public void process(Exchange exchange) throws Exception {
                       exchange.setProperty("REQUEST_APPROVAL_NO","APPROVAL_NO_");

                    }
                })
            .setProperty("ap_no").groovy("myVar=''; new groovy.json.JsonSlurper().parse(body).get('inputs').each {val -> if (val.name == exchange.getProperty('REQUEST_APPROVAL_NO')) myVar=val.value}; result=myVar");

        }
}
