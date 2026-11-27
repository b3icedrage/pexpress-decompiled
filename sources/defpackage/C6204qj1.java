package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqj1;", "LIM1;", "Lpj1;", "Lsu0;", "prefs", "<init>", "(Lsu0;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class C6204qj1 extends IM1<C5994pj1> {

    /* JADX INFO: renamed from: qj1$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lpj1;", "invoke", "()Lpj1;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function0<C5994pj1> {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final C5994pj1 invoke() {
            return new C5994pj1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6204qj1(@NotNull InterfaceC6659su0 prefs) {
        super(new C4395iM1(a.INSTANCE, "properties", prefs));
        Intrinsics.checkNotNullParameter(prefs, "prefs");
    }
}
