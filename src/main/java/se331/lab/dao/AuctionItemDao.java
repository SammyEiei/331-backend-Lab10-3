package se331.lab.dao;

import org.springframework.data.domain.Page;
import se331.lab.entity.AuctionItem;

public interface AuctionItemDao {
    Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page);

    Page<AuctionItem> getAuctionItemsByDescription(String description, Integer pageSize, Integer page);
}