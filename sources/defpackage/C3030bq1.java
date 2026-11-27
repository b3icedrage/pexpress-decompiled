package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: bq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3030bq1 extends C3239cq1.b {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Method g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ T52 i;
    public final /* synthetic */ Gson j;
    public final /* synthetic */ TypeToken k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3030bq1(String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, T52 t52, Gson gson, TypeToken typeToken, boolean z5, boolean z6) {
        super(str, field, z, z2);
        this.f = z3;
        this.g = method;
        this.h = z4;
        this.i = t52;
        this.j = gson;
        this.k = typeToken;
        this.l = z5;
        this.m = z6;
    }

    @Override // defpackage.C3239cq1.b
    public final void a(C7790yH0 c7790yH0, int i, Object[] objArr) {
        Object objA = this.i.a(c7790yH0);
        if (objA != null || !this.l) {
            objArr[i] = objA;
            return;
        }
        throw new C6529sH0("null is not allowed as value for record component '" + this.c + "' of primitive type; at path " + c7790yH0.k());
    }

    @Override // defpackage.C3239cq1.b
    public final void b(C7790yH0 c7790yH0, Object obj) throws IllegalAccessException {
        Object objA = this.i.a(c7790yH0);
        if (objA == null && this.l) {
            return;
        }
        Field field = this.b;
        if (this.f) {
            C3239cq1.b(obj, field);
        } else if (this.m) {
            throw new C2911bH0(C5491nL.c("Cannot set value of 'static final' ", C2437Xp1.d(field, false)));
        }
        field.set(obj, objA);
    }

    @Override // defpackage.C3239cq1.b
    public final void c(ZH0 zh0, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.d) {
            Field field = this.b;
            boolean z = this.f;
            Method method = this.g;
            if (z) {
                if (method == null) {
                    C3239cq1.b(obj, field);
                } else {
                    C3239cq1.b(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e) {
                    throw new C2911bH0(C1039Gc0.d("Accessor ", C2437Xp1.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            zh0.g(this.a);
            boolean z2 = this.h;
            T52 v52 = this.i;
            if (!z2) {
                v52 = new V52(this.j, v52, this.k.getType());
            }
            v52.b(zh0, objInvoke);
        }
    }
}
