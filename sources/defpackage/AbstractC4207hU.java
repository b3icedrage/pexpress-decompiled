package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4207hU<Target> implements InterfaceC7014uc0<Target> {

    @NotNull
    public final C1063Gk0 a;

    @NotNull
    public final List<Integer> b;

    /* JADX INFO: renamed from: hU$a */
    public /* synthetic */ class a extends C2784ak0 implements Function1<Target, C3997gU> {
        @Override // kotlin.jvm.functions.Function1
        public final C3997gU invoke(Object obj) {
            return (C3997gU) ((InterfaceC6475s2) this.e).b(obj);
        }
    }

    public AbstractC4207hU(@NotNull C1063Gk0 field, @NotNull List zerosToAdd) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(zerosToAdd, "zerosToAdd");
        this.a = field;
        this.b = zerosToAdd;
    }

    @Override // defpackage.InterfaceC7014uc0
    @NotNull
    public final InterfaceC1210Ih0<Target> a() {
        return new C4417iU(new a(1, this.a.a, InterfaceC6475s2.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0), this.b);
    }

    @Override // defpackage.InterfaceC7014uc0
    @NotNull
    public final C7436wc1<Target> b() {
        C1063Gk0 c1063Gk0 = this.a;
        return new C7436wc1<>(VE.c(new C7758y71(VE.c(new C1992Sh0(1, 9, c1063Gk0.a, c1063Gk0.b)))), C5653o60.d);
    }

    @Override // defpackage.InterfaceC7014uc0
    @NotNull
    public final InterfaceC0883Ec0<Target, C3997gU> c() {
        return this.a;
    }
}
