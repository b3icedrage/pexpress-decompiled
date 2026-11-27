package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5393ms {

    @NotNull
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;

    @NotNull
    public final List<Integer> e;

    public AbstractC5393ms(@NotNull int... numbers) {
        List<Integer> listE0;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.a = numbers;
        Integer numS = C1526Mj.s(numbers, 0);
        this.b = numS != null ? numS.intValue() : -1;
        Integer numS2 = C1526Mj.s(numbers, 1);
        this.c = numS2 != null ? numS2.intValue() : -1;
        Integer numS3 = C1526Mj.s(numbers, 2);
        this.d = numS3 != null ? numS3.intValue() : -1;
        if (numbers.length <= 3) {
            listE0 = C5653o60.d;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + JwtParser.SEPARATOR_CHAR);
            }
            Intrinsics.checkNotNullParameter(numbers, "<this>");
            listE0 = CollectionsKt.e0(new AbstractC5838p0.d(new C1293Jj(numbers), 3, numbers.length));
        }
        this.e = listE0;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractC5393ms abstractC5393ms = (AbstractC5393ms) obj;
        return this.b == abstractC5393ms.b && this.c == abstractC5393ms.c && this.d == abstractC5393ms.d && Intrinsics.a(this.e, abstractC5393ms.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    @NotNull
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.J(arrayList, ".", null, null, null, 62);
    }
}
