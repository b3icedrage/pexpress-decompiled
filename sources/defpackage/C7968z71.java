package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: renamed from: z71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7968z71 implements U52 {
    public final /* synthetic */ A71 d;

    public C7968z71(A71 a71) {
        this.d = a71;
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        if (typeToken.getRawType() == Number.class) {
            return this.d;
        }
        return null;
    }
}
