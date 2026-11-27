package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class TE implements U52 {
    public final ZK d;

    public static final class a<E> extends T52<Collection<E>> {
        public final V52 a;
        public final J71<? extends Collection<E>> b;

        public a(Gson gson, Type type, T52<E> t52, J71<? extends Collection<E>> j71) {
            this.a = new V52(gson, t52, type);
            this.b = j71;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.T52
        public final Object a(C7790yH0 c7790yH0) throws IOException {
            if (c7790yH0.G() == JH0.m) {
                c7790yH0.A();
                return null;
            }
            Collection<E> collectionE = this.b.e();
            c7790yH0.l1();
            while (c7790yH0.hasNext()) {
                collectionE.add(this.a.b.a(c7790yH0));
            }
            c7790yH0.h1();
            return collectionE;
        }

        @Override // defpackage.T52
        public final void b(ZH0 zh0, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                zh0.l();
                return;
            }
            zh0.l1();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.a.b(zh0, it.next());
            }
            zh0.h1();
        }
    }

    public TE(ZK zk) {
        this.d = zk;
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C7652xe.b(Collection.class.isAssignableFrom(rawType));
        Type typeF = C2624a.f(type, rawType, C2624a.d(type, rawType, Collection.class), new HashMap());
        Type type2 = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments()[0] : Object.class;
        return new a(gson, type2, gson.f(TypeToken.get(type2)), this.d.b(typeToken));
    }
}
