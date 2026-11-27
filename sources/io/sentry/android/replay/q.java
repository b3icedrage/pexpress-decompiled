package io.sentry.android.replay;

import defpackage.C1952Ru;
import defpackage.InterfaceC4346i70;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/sentry/android/replay/q;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "STARTED", "RESUMED", "PAUSED", "STOPPED", "CLOSED", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum q {
    INITIAL,
    STARTED,
    RESUMED,
    PAUSED,
    STOPPED,
    CLOSED;

    private static final /* synthetic */ InterfaceC4346i70 $ENTRIES = C1952Ru.i(values());

    @NotNull
    public static InterfaceC4346i70<q> getEntries() {
        return $ENTRIES;
    }
}
