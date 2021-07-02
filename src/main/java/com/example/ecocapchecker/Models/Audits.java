package com.example.ecocapchecker.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data@JsonIgnoreProperties(ignoreUnknown = true)@NoArgsConstructor@AllArgsConstructor
public class Audits {
    @JsonProperty("bootup-time")
    private BootUpTime bootUpTime;
    @JsonProperty("")
    private CriticalRequestChain criticalRequestChain;
    @JsonProperty("")
    private CssRules cssRules;
    @JsonProperty("")
    private CummulatifLayoutShift cummulatifLayoutShift;
    @JsonProperty("")
    private Diagnostics diagnostics;
    @JsonProperty("")
    private DomSize domSize;
    @JsonProperty("")
    private DuplicatedJavascript duplicatedJavascript;
    @JsonProperty("efficient-animated-content")
    private EfficientAnimatedContent efficientAnimatedContent;
    @JsonProperty("final-screenshot")
    private FinalScreenShot finalScreenShot;
    @JsonProperty("")
    private FirstMeaningFulPaint firstMeaningFulPaint;
    @JsonProperty("")
    private FirstContentFulPaint firstContentFulPaint;
    @JsonProperty("")
    private FontDisplay fontDisplay;
    @JsonProperty("full-page-screenshot")
    private FullPageScreenShot fullPageScreenShot;
    @JsonProperty("")
    private Interactif interactif;
    @JsonProperty("")
    private LargestContentfulPaintElement largestContentfulPaintElement;
    @JsonProperty("")
    private LargetContentfulPaint largetContentfulPaint;
    @JsonProperty("layout-shift-elements")
    private LayoutShiftElemnt layoutShiftElemnt;
    @JsonProperty("")
    private LegacyJavascript legacyJavascript;
    @JsonProperty("")
    private LongTasks longTasks;
    @JsonProperty("")
    private MainThreadsTasks mainThreadsTasks;
    @JsonProperty("mainthread-work-breakdown")
    private MainThreadWorkBreakDown mainThreadWorkBreakDown;
    @JsonProperty("")
    private MaxPotentielFid maxPotentielFid;
    @JsonProperty("network-rtt")
    private NetworkRtt networkRtt;
    @JsonProperty("")
    private NetworkServerLatency networkServerLatency;
    @JsonProperty("")
    private NoDocumentWrite noDocumentWrite;
    @JsonProperty("")
    private NonCompositedAnimation nonCompositedAnimation;
    @JsonProperty("offscreen-image")
    private OffScreenImages offScreenImages;
    @JsonProperty("performance-budget")
    private PerformanceBudget performanceBudget;
    @JsonProperty("preload-lcp-image")
    private PreLoadLcpImage preLoadLcpImage;
    @JsonProperty("")
    private Redirects redirects;
    @JsonProperty("")
    private RenderBlockingResource renderBlockingResource;
    @JsonProperty("")
    private ResourceSummary resourceSummary;
    @JsonProperty("")
    private ScriptTreemapData scriptTreemapData;
    @JsonProperty("")
    private ServerTimeRespone serverTimeRespone;
    @JsonProperty("")
    private SpeedIndex speedIndex;
    @JsonProperty("third-party-facades")
    private ThirdPartyFacade thirdPartyFacade;
    @JsonProperty("third-party-summary")
    private ThirdPartySummary thirdPartySummary;
    @JsonProperty("timing-budget")
    private TimingBudget timingBudget;
    @JsonProperty("")
    private TotalBlockingTime totalBlockingTime;
    @JsonProperty("")
    private TotalByteWeight totalByteWeight;
    @JsonProperty("")
    private UnminifiedCss unminifiedCss;
    @JsonProperty("")
    private UnminifiedJavascript unminifiedJavascript;
    @JsonProperty("")
    private UnsizedImage unsizedImage;
    @JsonProperty("")
    private UnusedJavascript unusedJavascript;
    @JsonProperty("uses-long-cache-ttl")
    private UseLongCacheTtl useLongCacheTtl;
    @JsonProperty("")
    private UseRelPreconnect useRelPreconnect;
    @JsonProperty("")
    private UseResponsiveImages useResponsiveImages;
    @JsonProperty("")
    private UserTiming userTiming;
    @JsonProperty("uses-optimized-imagesF")
    private UsesOptimizedImage usesOptimizedImage;
    @JsonProperty("")
    private UsesPassiveEventListener usesPassiveEventListener;
    @JsonProperty("")
    private UseTextCompression useTextCompression;









}
