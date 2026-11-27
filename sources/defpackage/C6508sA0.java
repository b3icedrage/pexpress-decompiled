package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6508sA0 extends C6188qf1 {
    public final boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6508sA0(@NotNull String name, @NotNull C6718tA0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [fO0, java.lang.Object] */
    @Override // defpackage.C6188qf1
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6508sA0) {
            MH1 mh1 = (MH1) obj;
            if (Intrinsics.a(this.a, mh1.a())) {
                C6508sA0 c6508sA0 = (C6508sA0) obj;
                if (c6508sA0.l && Arrays.equals((MH1[]) this.j.getValue(), (MH1[]) c6508sA0.j.getValue())) {
                    int iE = mh1.e();
                    int i = this.c;
                    if (i == iE) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (Intrinsics.a(i(i2).a(), mh1.i(i2).a()) && Intrinsics.a(i(i2).h(), mh1.i(i2).h())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.C6188qf1
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.C6188qf1, defpackage.MH1
    public final boolean m() {
        return this.l;
    }
}
