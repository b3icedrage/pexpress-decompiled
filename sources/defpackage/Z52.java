package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class Z52 implements U52 {
    public final /* synthetic */ Class d;
    public final /* synthetic */ Class e;
    public final /* synthetic */ T52 g;

    public Z52(Class cls, Class cls2, T52 t52) {
        this.d = cls;
        this.e = cls2;
        this.g = t52;
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (rawType == this.d || rawType == this.e) {
            return this.g;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.e.getName() + "+" + this.d.getName() + ",adapter=" + this.g + "]";
    }
}
