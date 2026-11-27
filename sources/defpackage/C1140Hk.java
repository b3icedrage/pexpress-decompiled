package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1140Hk implements JN1 {

    @NotNull
    public final InterfaceC1153Ho0 a;

    @NotNull
    public final AF1 b;

    /* JADX INFO: renamed from: Hk$a */
    public static final class a extends ML0 implements Function1<C0997Fo0, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C0997Fo0 c0997Fo0) {
            C0997Fo0 historyMessage = c0997Fo0;
            Intrinsics.checkNotNullParameter(historyMessage, "historyMessage");
            C1140Hk.this.a.N(historyMessage);
            return Unit.a;
        }
    }

    public C1140Hk(@NotNull InterfaceC1153Ho0 historyRepository, @NotNull AF1 sendMessageRepository) {
        Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
        Intrinsics.checkNotNullParameter(sendMessageRepository, "sendMessageRepository");
        this.a = historyRepository;
        this.b = sendMessageRepository;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        String str2 = message.b;
        if (str2 == null || StringsKt.I(str2) || (str = message.d) == null || StringsKt.I(str)) {
            return;
        }
        this.b.e(message, new a());
    }
}
