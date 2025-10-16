package de.markostreich.paperlessngx.ai.service;

import de.markostreich.paperless.client.api.ApiApi;
import de.markostreich.paperless.client.model_.Document;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentService {

    private final ApiApi api;

    public Document getDocument(final Integer id) {
        return api.documentsRetrieve(id, null, null).getBody();
    }
}
