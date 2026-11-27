package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class U71 implements U52 {
    public final /* synthetic */ EnumC2852b02 d;

    public U71(EnumC2852b02 enumC2852b02) {
        this.d = enumC2852b02;
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        if (typeToken.getRawType() == Object.class) {
            return new V71(gson, this.d);
        }
        return null;
    }
}
