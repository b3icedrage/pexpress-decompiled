package defpackage;

import java.lang.reflect.InvocationTargetException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class J7 extends I7.b {
    @Override // I7.b
    public final void d(YH0 yh0, @Nullable Object obj) throws InvocationTargetException {
        AbstractC5897pG0<?>[] abstractC5897pG0Arr = this.f;
        Object[] objArr = new Object[abstractC5897pG0Arr.length + 2];
        objArr[0] = yh0;
        objArr[1] = obj;
        System.arraycopy(abstractC5897pG0Arr, 0, objArr, 2, abstractC5897pG0Arr.length);
        try {
            this.d.invoke(this.c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
