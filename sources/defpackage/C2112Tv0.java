package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Tv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LTv0;", "LIM1;", "LSv0;", "Lsu0;", "prefs", "<init>", "(Lsu0;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class C2112Tv0 extends IM1<C2034Sv0> {

    /* JADX INFO: renamed from: Tv0$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LSv0;", "invoke", "()LSv0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function0<C2034Sv0> {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final C2034Sv0 invoke() {
            return new C2034Sv0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2112Tv0(@NotNull InterfaceC6659su0 prefs) {
        super(new C4395iM1(a.INSTANCE, "identity", prefs));
        Intrinsics.checkNotNullParameter(prefs, "prefs");
    }
}
