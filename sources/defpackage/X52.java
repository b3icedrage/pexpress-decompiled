package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class X52 implements U52 {
    public final /* synthetic */ TypeToken d;
    public final /* synthetic */ T52 e;

    public X52(TypeToken typeToken, T52 t52) {
        this.d = typeToken;
        this.e = t52;
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        if (typeToken.equals(this.d)) {
            return this.e;
        }
        return null;
    }
}
