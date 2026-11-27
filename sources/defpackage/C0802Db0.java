package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Db0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0802Db0 implements JN1 {

    @NotNull
    public final J92 a;

    public C0802Db0(@NotNull J92 unsupportedRepository) {
        Intrinsics.checkNotNullParameter(unsupportedRepository, "unsupportedRepository");
        this.a = unsupportedRepository;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.d(message);
    }
}
