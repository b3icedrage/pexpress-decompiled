package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: Vw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0010\u0018\u0000 .2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, d2 = {"LVw0;", "", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "", "contentHtml", "Ljava/lang/String;", "getContentHtml", "()Ljava/lang/String;", "setContentHtml", "(Ljava/lang/String;)V", "", "useHeightMargin", "Z", "getUseHeightMargin", "()Z", "setUseHeightMargin", "(Z)V", "useWidthMargin", "getUseWidthMargin", "setUseWidthMargin", "isFullBleed", "setFullBleed", "Lei2$c;", C3630ei2.IAM_DISPLAY_LOCATION_KEY, "Lei2$c;", "getDisplayLocation", "()Lei2$c;", "setDisplayLocation", "(Lei2$c;)V", "", "displayDuration", "Ljava/lang/Double;", "getDisplayDuration", "()Ljava/lang/Double;", "setDisplayDuration", "(Ljava/lang/Double;)V", "", "pageHeight", "I", "getPageHeight", "()I", "setPageHeight", "(I)V", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class C2271Vw0 {

    @NotNull
    public static final String DISPLAY_DURATION = "display_duration";

    @NotNull
    public static final String HTML = "html";

    @NotNull
    public static final String REMOVE_HEIGHT_MARGIN = "remove_height_margin";

    @NotNull
    public static final String REMOVE_WIDTH_MARGIN = "remove_width_margin";

    @NotNull
    public static final String STYLES = "styles";

    @Nullable
    private String contentHtml;

    @Nullable
    private Double displayDuration;

    @Nullable
    private C3630ei2.c displayLocation;
    private boolean isFullBleed;
    private int pageHeight;
    private boolean useHeightMargin;
    private boolean useWidthMargin;

    public C2271Vw0(@NotNull JSONObject jsonObject) {
        Boolean boolSafeBool;
        Boolean boolSafeBool2;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.useHeightMargin = true;
        this.useWidthMargin = true;
        this.contentHtml = JD0.safeString(jsonObject, HTML);
        this.displayDuration = JD0.safeDouble(jsonObject, DISPLAY_DURATION);
        JSONObject jSONObjectSafeJSONObject = JD0.safeJSONObject(jsonObject, STYLES);
        boolean zBooleanValue = false;
        this.useHeightMargin = !((jSONObjectSafeJSONObject == null || (boolSafeBool2 = JD0.safeBool(jSONObjectSafeJSONObject, REMOVE_HEIGHT_MARGIN)) == null) ? false : boolSafeBool2.booleanValue());
        if (jSONObjectSafeJSONObject != null && (boolSafeBool = JD0.safeBool(jSONObjectSafeJSONObject, REMOVE_WIDTH_MARGIN)) != null) {
            zBooleanValue = boolSafeBool.booleanValue();
        }
        this.useWidthMargin = !zBooleanValue;
        this.isFullBleed = !this.useHeightMargin;
    }

    @Nullable
    public final String getContentHtml() {
        return this.contentHtml;
    }

    @Nullable
    public final Double getDisplayDuration() {
        return this.displayDuration;
    }

    @Nullable
    public final C3630ei2.c getDisplayLocation() {
        return this.displayLocation;
    }

    public final int getPageHeight() {
        return this.pageHeight;
    }

    public final boolean getUseHeightMargin() {
        return this.useHeightMargin;
    }

    public final boolean getUseWidthMargin() {
        return this.useWidthMargin;
    }

    /* JADX INFO: renamed from: isFullBleed, reason: from getter */
    public final boolean getIsFullBleed() {
        return this.isFullBleed;
    }

    public final void setContentHtml(@Nullable String str) {
        this.contentHtml = str;
    }

    public final void setDisplayDuration(@Nullable Double d) {
        this.displayDuration = d;
    }

    public final void setDisplayLocation(@Nullable C3630ei2.c cVar) {
        this.displayLocation = cVar;
    }

    public final void setFullBleed(boolean z) {
        this.isFullBleed = z;
    }

    public final void setPageHeight(int i) {
        this.pageHeight = i;
    }

    public final void setUseHeightMargin(boolean z) {
        this.useHeightMargin = z;
    }

    public final void setUseWidthMargin(boolean z) {
        this.useWidthMargin = z;
    }
}
