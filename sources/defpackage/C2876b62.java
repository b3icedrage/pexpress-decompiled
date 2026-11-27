package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: renamed from: b62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2876b62 implements U52 {
    public final /* synthetic */ Class d;
    public final /* synthetic */ T52 e;

    /* JADX INFO: renamed from: b62$a */
    public class a extends T52<Object> {
        public final /* synthetic */ Class a;

        public a(Class cls) {
            this.a = cls;
        }

        @Override // defpackage.T52
        public final Object a(C7790yH0 c7790yH0) {
            Object objA = C2876b62.this.e.a(c7790yH0);
            if (objA != null) {
                Class cls = this.a;
                if (!cls.isInstance(objA)) {
                    throw new HH0("Expected a " + cls.getName() + " but was " + objA.getClass().getName() + "; at path " + c7790yH0.p());
                }
            }
            return objA;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Object obj) {
            C2876b62.this.e.b(zh0, obj);
        }
    }

    public C2876b62(Class cls, T52 t52) {
        this.d = cls;
        this.e = t52;
    }

    @Override // defpackage.U52
    public final <T2> T52<T2> a(Gson gson, TypeToken<T2> typeToken) {
        Class<? super T2> rawType = typeToken.getRawType();
        if (this.d.isAssignableFrom(rawType)) {
            return new a(rawType);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.d.getName() + ",adapter=" + this.e + "]";
    }
}
