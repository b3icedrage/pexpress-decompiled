package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
public final class V52<T> extends T52<T> {
    public final Gson a;
    public final T52<T> b;
    public final Type c;

    public V52(Gson gson, T52<T> t52, Type type) {
        this.a = gson;
        this.b = t52;
        this.c = type;
    }

    @Override // defpackage.T52
    public final T a(C7790yH0 c7790yH0) {
        return this.b.a(c7790yH0);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    @Override // defpackage.T52
    public final void b(ZH0 zh0, T t) {
        T52<T> t52C;
        Type type = this.c;
        Type type2 = (t == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : t.getClass();
        T52<T> t52 = this.b;
        if (type2 != type) {
            T52<T> t52F = this.a.f(TypeToken.get(type2));
            if (t52F instanceof C3239cq1.a) {
                T52<T> t53 = t52;
                while ((t53 instanceof YH1) && (t52C = ((YH1) t53).c()) != t53) {
                    t53 = t52C;
                }
                if (t53 instanceof C3239cq1.a) {
                    t52 = t52F;
                }
            } else {
                t52 = t52F;
            }
        }
        t52.b(zh0, t);
    }
}
