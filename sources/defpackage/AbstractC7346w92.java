package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: w92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7346w92<Target> implements InterfaceC7014uc0<Target> {

    @NotNull
    public final C6926u92<Target> a;
    public final int b;

    @Nullable
    public final Integer c;
    public final int d;

    /* JADX INFO: renamed from: w92$a */
    public /* synthetic */ class a extends C2784ak0 implements Function1<Target, Integer> {
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Object obj) {
            return (Integer) ((InterfaceC6475s2) this.e).b(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC7346w92(@NotNull C6926u92<? super Target> field, int i, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.a = field;
        this.b = i;
        this.c = num;
        int i2 = field.g;
        this.d = i2;
        if (i < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i, "The minimum number of digits (", ") is negative").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i2 + ") is less than the minimum number of digits (" + i + ')').toString());
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    @Override // defpackage.InterfaceC7014uc0
    @NotNull
    public final InterfaceC1210Ih0<Target> a() {
        a number = new a(1, this.a.a, InterfaceC6475s2.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        int i = this.b;
        Intrinsics.checkNotNullParameter(number, "number");
        C7557x92 c7557x92 = new C7557x92();
        if (i < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i, "The minimum number of digits (", ") is negative").toString());
        }
        if (i <= 9) {
            return this.c != null ? new C3142cO1(c7557x92) : c7557x92;
        }
        throw new IllegalArgumentException(C1332Jw.a(i, "The minimum number of digits (", ") exceeds the length of an Int").toString());
    }

    @Override // defpackage.InterfaceC7014uc0
    @NotNull
    public final C7436wc1<Target> b() {
        Integer numValueOf = Integer.valueOf(this.b);
        Integer numValueOf2 = Integer.valueOf(this.d);
        C6926u92<Target> c6926u92 = this.a;
        return C0957Fb.w(numValueOf, numValueOf2, this.c, c6926u92.a, c6926u92.d, false);
    }

    @Override // defpackage.InterfaceC7014uc0
    public final /* bridge */ /* synthetic */ InterfaceC0883Ec0 c() {
        return this.a;
    }
}
