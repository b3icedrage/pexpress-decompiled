package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0591Aj<T> extends AbstractC7882yj<T> {

    @NotNull
    public Object[] d;
    public int e;

    /* JADX INFO: renamed from: Aj$a */
    public static final class a extends AbstractC4785k0<T> {
        public int g = -1;
        public final /* synthetic */ C0591Aj<T> h;

        public a(C0591Aj<T> c0591Aj) {
            this.h = c0591Aj;
        }

        @Override // defpackage.AbstractC4785k0
        public final void b() {
            int i;
            Object[] objArr;
            do {
                i = this.g + 1;
                this.g = i;
                objArr = this.h.d;
                if (i >= objArr.length) {
                    break;
                }
            } while (objArr[i] == null);
            if (i >= objArr.length) {
                this.d = 2;
                return;
            }
            T t = (T) objArr[i];
            Intrinsics.c(t, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            this.e = t;
            this.d = 1;
        }
    }

    @Override // defpackage.AbstractC7882yj
    public final int b() {
        return this.e;
    }

    @Override // defpackage.AbstractC7882yj
    public final void c(int i, @NotNull AbstractC5022l62 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArr = this.d;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            Object[] objArrCopyOf = Arrays.copyOf(this.d, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.d = objArrCopyOf;
        }
        Object[] objArr2 = this.d;
        if (objArr2[i] == null) {
            this.e++;
        }
        objArr2[i] = value;
    }

    @Override // defpackage.AbstractC7882yj
    @Nullable
    public final T get(int i) {
        return (T) C1526Mj.t(this.d, i);
    }

    @Override // defpackage.AbstractC7882yj, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
