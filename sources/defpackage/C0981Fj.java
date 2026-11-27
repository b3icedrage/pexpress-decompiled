package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: renamed from: Fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0981Fj<E> extends T52<Object> {
    public static final a c = new a();
    public final Class<E> a;
    public final V52 b;

    /* JADX INFO: renamed from: Fj$a */
    public class a implements U52 {
        @Override // defpackage.U52
        public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new C0981Fj(gson, gson.f(TypeToken.get(genericComponentType)), C2624a.e(genericComponentType));
        }
    }

    public C0981Fj(Gson gson, T52<E> t52, Class<E> cls) {
        this.b = new V52(gson, t52, cls);
        this.a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.T52
    public final Object a(C7790yH0 c7790yH0) throws IOException {
        if (c7790yH0.G() == JH0.m) {
            c7790yH0.A();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c7790yH0.l1();
        while (c7790yH0.hasNext()) {
            arrayList.add(this.b.b.a(c7790yH0));
        }
        c7790yH0.h1();
        int size = arrayList.size();
        Class<E> cls = this.a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // defpackage.T52
    public final void b(ZH0 zh0, Object obj) throws IOException {
        if (obj == null) {
            zh0.l();
            return;
        }
        zh0.l1();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.b(zh0, Array.get(obj, i));
        }
        zh0.h1();
    }
}
