package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class K7 extends I7.b {
    public AbstractC5897pG0<Object> h;
    public final /* synthetic */ Type[] i;
    public final /* synthetic */ Type j;
    public final /* synthetic */ Set k;
    public final /* synthetic */ Set l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(Type type, Set set, Object obj, Method method, int i, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
        super(type, set, obj, method, i, 1, z);
        this.i = typeArr;
        this.j = type2;
        this.k = set2;
        this.l = set3;
    }

    @Override // I7.b
    public final void a(C3903g11 c3903g11, I7 i7) {
        super.a(c3903g11, i7);
        Type type = this.i[0];
        Type type2 = this.j;
        boolean zB = C6918u72.b(type, type2);
        Set<? extends Annotation> set = this.l;
        this.h = (zB && this.k.equals(set)) ? c3903g11.d(i7, type2, set) : c3903g11.c(type2, set, null);
    }

    @Override // I7.b
    public final void d(YH0 yh0, @Nullable Object obj) {
        this.h.e(yh0, c(obj));
    }
}
