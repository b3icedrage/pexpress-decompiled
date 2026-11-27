package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: jn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4746jn0 extends WM.a {
    public final Gson a;

    public C4746jn0(Gson gson) {
        this.a = gson;
    }

    @Override // WM.a
    public final WM<?, AbstractC5395ms1> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C2263Vt1 c2263Vt1) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.a;
        return new C5166ln0(gson, gson.f(typeToken));
    }

    @Override // WM.a
    public final WM<AbstractC1091Gt1, ?> b(Type type, Annotation[] annotationArr, C2263Vt1 c2263Vt1) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.a;
        return new C5379mn0(gson, gson.f(typeToken));
    }
}
