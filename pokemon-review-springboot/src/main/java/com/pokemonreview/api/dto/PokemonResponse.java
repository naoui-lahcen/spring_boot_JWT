package com.pokemonreview.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PokemonResponse {
    private List<PokemonDto> content;
    private int pageNo;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean last;
	public List<PokemonDto> getContent() {
		return content;
	}
	public void setContent(List<PokemonDto> content) {
		this.content = content;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public boolean isLast() {
		return last;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
    
    
}
