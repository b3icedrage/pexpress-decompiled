package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lvx;", "", "", "influenceId", "LKz0;", "channel", "<init>", "(Ljava/lang/String;LKz0;)V", "Ljava/lang/String;", "getInfluenceId", "()Ljava/lang/String;", "LKz0;", "getChannel", "()LKz0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7297vx {

    @NotNull
    private final EnumC1420Kz0 channel;

    @NotNull
    private final String influenceId;

    public C7297vx(@NotNull String influenceId, @NotNull EnumC1420Kz0 channel) {
        Intrinsics.checkNotNullParameter(influenceId, "influenceId");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.influenceId = influenceId;
        this.channel = channel;
    }

    @NotNull
    public final EnumC1420Kz0 getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getInfluenceId() {
        return this.influenceId;
    }
}
