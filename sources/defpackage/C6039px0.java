package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: px0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lpx0;", "", "<init>", "()V", "", "paused", "Z", "getPaused", "()Z", "setPaused", "(Z)V", "", "inAppMessageIdShowing", "Ljava/lang/String;", "getInAppMessageIdShowing", "()Ljava/lang/String;", "setInAppMessageIdShowing", "(Ljava/lang/String;)V", "", "lastTimeInAppDismissed", "Ljava/lang/Long;", "getLastTimeInAppDismissed", "()Ljava/lang/Long;", "setLastTimeInAppDismissed", "(Ljava/lang/Long;)V", "Lcx0;", "currentPrompt", "Lcx0;", "getCurrentPrompt", "()Lcx0;", "setCurrentPrompt", "(Lcx0;)V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6039px0 {

    @Nullable
    private AbstractC3259cx0 currentPrompt;

    @Nullable
    private String inAppMessageIdShowing;

    @Nullable
    private Long lastTimeInAppDismissed;
    private boolean paused;

    @Nullable
    public final AbstractC3259cx0 getCurrentPrompt() {
        return this.currentPrompt;
    }

    @Nullable
    public final String getInAppMessageIdShowing() {
        return this.inAppMessageIdShowing;
    }

    @Nullable
    public final Long getLastTimeInAppDismissed() {
        return this.lastTimeInAppDismissed;
    }

    public final boolean getPaused() {
        return this.paused;
    }

    public final void setCurrentPrompt(@Nullable AbstractC3259cx0 abstractC3259cx0) {
        this.currentPrompt = abstractC3259cx0;
    }

    public final void setInAppMessageIdShowing(@Nullable String str) {
        this.inAppMessageIdShowing = str;
    }

    public final void setLastTimeInAppDismissed(@Nullable Long l) {
        this.lastTimeInAppDismissed = l;
    }

    public final void setPaused(boolean z) {
        this.paused = z;
    }
}
