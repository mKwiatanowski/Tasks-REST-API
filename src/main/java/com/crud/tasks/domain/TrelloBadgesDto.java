package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloBadgesDto {

    @JsonProperty("votes")
    private int votes;

    @JsonProperty("attachmentsByType")
    private TrelloAttachmentsByTypeDto attachments;

}
