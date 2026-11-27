package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Hr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHr1;", "", "<init>", "()V", "Lus0;", "databaseProvider", "", "run", "(Lus0;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1163Hr1 {

    @NotNull
    public static final C1163Hr1 INSTANCE = new C1163Hr1();

    private C1163Hr1() {
    }

    public final void run(@NotNull InterfaceC7073us0 databaseProvider) {
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        databaseProvider.getOs().delete("outcome", "name = \"os__session_duration\" AND session_time = 0", null);
    }
}
