package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class Y52 implements U52 {
    public final /* synthetic */ Class d;
    public final /* synthetic */ T52 e;

    public Y52(Class cls, T52 t52) {
        this.d = cls;
        this.e = t52;
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        if (typeToken.getRawType() == this.d) {
            return this.e;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.d.getName() + ",adapter=" + this.e + "]";
    }
}
