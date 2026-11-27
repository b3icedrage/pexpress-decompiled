package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: tK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6747tK extends AbstractC5422n1 {

    @NotNull
    public static final List<EnumC2519Yr> l;
    public final int i;

    @NotNull
    public List<Double> j;

    @NotNull
    public final C2597Zr k;

    static {
        EnumC2519Yr enumC2519Yr = EnumC2519Yr.d;
        l = WE.f(enumC2519Yr, enumC2519Yr, EnumC2519Yr.e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6747tK(int i, int i2, double d, C5475nF1 client) {
        super(i, client);
        Intrinsics.checkNotNullParameter(client, "client");
        this.i = i2;
        this.k = new C2597Zr(l);
        double d2 = ((double) i) / 2.0d;
        double d3 = ((d / 100.0d) * d2) + d2;
        this.j = WE.f(Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d3), Double.valueOf(d3), Double.valueOf(d2));
    }

    @Override // defpackage.AbstractC5422n1
    @NotNull
    public final R9 c(@NotNull C6712t82 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.k.a(EnumC2519Yr.g);
        return super.c(params);
    }

    @Override // defpackage.AbstractC5422n1
    @NotNull
    public final R9 d(@NotNull S9 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.k.a(EnumC2519Yr.d);
        List<Double> listB = CollectionsKt.B(CollectionsKt.A(this.j, 1));
        this.j = listB;
        if (listB.size() > 1) {
            return new R9.b((int) Math.ceil(Math.abs(((Number) CollectionsKt.L(this.j)).doubleValue() + ((Number) CollectionsKt.F(this.j)).doubleValue())));
        }
        X91 x91 = new X91((int) Math.ceil(Math.abs(params.c)), this.i, params.a, this.e);
        Intrinsics.checkNotNullParameter(x91, "<this>");
        return new R9.a(x91);
    }

    @Override // defpackage.AbstractC5422n1
    @NotNull
    public final R9 g(@NotNull S9 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        EnumC2519Yr betResult = EnumC2519Yr.e;
        C2597Zr c2597Zr = this.k;
        c2597Zr.getClass();
        Intrinsics.checkNotNullParameter(betResult, "betResult");
        c2597Zr.a(betResult);
        List<EnumC2519Yr> list = c2597Zr.a;
        boolean zIsEmpty = list.isEmpty();
        ArrayList arrayList = c2597Zr.b;
        if (!zIsEmpty) {
            if (list.isEmpty() || !arrayList.isEmpty()) {
                int iIndexOfSubList = Collections.indexOfSubList(arrayList, list);
                while (arrayList.size() > list.size()) {
                    arrayList.remove(0);
                }
                if (iIndexOfSubList != -1) {
                }
            }
            ArrayList arrayListR = CollectionsKt.R(this.j, Double.valueOf(params.b));
            this.j = arrayListR;
            return new R9.b((int) Math.ceil(Math.abs(((Number) CollectionsKt.L(this.j)).doubleValue() + ((Number) CollectionsKt.F(arrayListR)).doubleValue())));
        }
        arrayList.clear();
        double d = params.c;
        if (d < 0.0d) {
            X91 x91 = new X91((int) Math.ceil(Math.abs(d)), this.i, params.a, this.e);
            Intrinsics.checkNotNullParameter(x91, "<this>");
            return new R9.a(x91);
        }
        ArrayList arrayListR2 = CollectionsKt.R(this.j, Double.valueOf(params.b));
        this.j = arrayListR2;
        return new R9.b((int) Math.ceil(Math.abs(((Number) CollectionsKt.L(this.j)).doubleValue() + ((Number) CollectionsKt.F(arrayListR2)).doubleValue())));
    }

    @Override // defpackage.AbstractC5422n1
    public final void h(int i) {
        Objects.toString(this.j);
    }
}
