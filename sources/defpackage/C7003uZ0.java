package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7003uZ0 {
    public final LinkedHashMap a;
    public final List<InterfaceC6793tZ0.a> b;

    /* JADX INFO: renamed from: uZ0$a */
    public static final class a {

        @NotNull
        public final Type a;

        @NotNull
        public final Annotation[] b;

        public a(@NotNull Type type, @NotNull Annotation[] annotations) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            this.a = type;
            this.b = annotations;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.tinder.scarlet.internal.servicemethod.MessageAdapterResolver.MessageAdapterKey");
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.a, aVar.a) && Arrays.equals(this.b, aVar.b);
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + Arrays.hashCode(this.b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("MessageAdapterKey(type=");
            sb.append(this.a);
            sb.append(", annotations=");
            return C5807oq.b(sb, Arrays.toString(this.b), ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7003uZ0(@NotNull List<? extends InterfaceC6793tZ0.a> messageAdapterFactories) {
        Intrinsics.checkNotNullParameter(messageAdapterFactories, "messageAdapterFactories");
        this.b = messageAdapterFactories;
        this.a = new LinkedHashMap();
    }

    @NotNull
    public final InterfaceC6793tZ0<Object> a(@NotNull Type type, @NotNull Annotation[] annotations) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        a aVar = new a(type, annotations);
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(aVar)) {
            Object obj = linkedHashMap.get(aVar);
            Intrinsics.checkNotNull(obj);
            return (InterfaceC6793tZ0) obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC6793tZ0.a> it = this.b.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC6793tZ0<?> interfaceC6793tZ0A = it.next().a(type, annotations);
                linkedHashMap.put(aVar, interfaceC6793tZ0A);
                return interfaceC6793tZ0A;
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        Object[] array = arrayList.toArray(new Throwable[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Throwable[] thArr = (Throwable[]) array;
        throw new IllegalStateException("Cannot resolve message adapter for type: " + type + ", annotations: " + annotations + JwtParser.SEPARATOR_CHAR, new HH((Throwable[]) Arrays.copyOf(thArr, thArr.length)));
    }
}
