package se331.lab.util;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se331.lab.entity.AuctionItem;
import se331.lab.entity.AuctionItemDto;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);

    AuctionItemDto getAuctionItem(AuctionItem auctionItem);
    List<AuctionItemDto> getAuctionItem(List<AuctionItem> auctionItems);
}