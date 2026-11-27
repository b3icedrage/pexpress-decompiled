package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: renamed from: rG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6316rG0 implements U52 {
    public final ZK d;

    public C6316rG0(ZK zk) {
        this.d = zk;
    }

    public static T52 b(ZK zk, Gson gson, TypeToken typeToken, InterfaceC6107qG0 interfaceC6107qG0) {
        T52 t52A;
        Object objE = zk.b(TypeToken.get((Class) interfaceC6107qG0.value())).e();
        boolean zNullSafe = interfaceC6107qG0.nullSafe();
        if (objE instanceof T52) {
            t52A = (T52) objE;
        } else if (objE instanceof U52) {
            t52A = ((U52) objE).a(gson, typeToken);
        } else {
            boolean z = objE instanceof DH0;
            if (!z && !(objE instanceof LG0)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objE.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            C4130h52 c4130h52 = new C4130h52(z ? (DH0) objE : null, objE instanceof LG0 ? (LG0) objE : null, gson, typeToken, null, zNullSafe);
            zNullSafe = false;
            t52A = c4130h52;
        }
        return (t52A == null || !zNullSafe) ? t52A : new S52(t52A);
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        InterfaceC6107qG0 interfaceC6107qG0 = (InterfaceC6107qG0) typeToken.getRawType().getAnnotation(InterfaceC6107qG0.class);
        if (interfaceC6107qG0 == null) {
            return null;
        }
        return b(this.d, gson, typeToken, interfaceC6107qG0);
    }
}
