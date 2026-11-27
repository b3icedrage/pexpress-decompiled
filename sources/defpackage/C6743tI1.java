package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\f\u001a\u00020\t\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0012\u001a\u00028\u0000\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0011J#\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\f\u0010\u0017J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u000f\u0010\u0018J#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0012\u0010\u0019J%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0014\u0010\u0019R.\u0010\u001c\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"LtI1;", "LOu0;", "", "LuI1;", "registrations", "<init>", "(Ljava/util/List;)V", "", "T", "", "hasService$com_onesignal_core", "()Z", "hasService", "getAllServices$com_onesignal_core", "()Ljava/util/List;", "getAllServices", "getService$com_onesignal_core", "()Ljava/lang/Object;", "getService", "getServiceOrNull$com_onesignal_core", "getServiceOrNull", "Ljava/lang/Class;", "c", "(Ljava/lang/Class;)Z", "(Ljava/lang/Class;)Ljava/util/List;", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "", "serviceMap", "Ljava/util/Map;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6743tI1 implements InterfaceC1719Ou0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String indent = "";

    @NotNull
    private final Map<Class<?>, List<AbstractC6953uI1<?>>> serviceMap;

    /* JADX INFO: renamed from: tI1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LtI1$a;", "", "<init>", "()V", "", "indent", "Ljava/lang/String;", "getIndent", "()Ljava/lang/String;", "setIndent", "(Ljava/lang/String;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getIndent() {
            return C6743tI1.indent;
        }

        public final void setIndent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            C6743tI1.indent = str;
        }

        private Companion() {
        }
    }

    public C6743tI1(@NotNull List<? extends AbstractC6953uI1<?>> registrations) {
        Intrinsics.checkNotNullParameter(registrations, "registrations");
        this.serviceMap = new LinkedHashMap();
        for (AbstractC6953uI1<?> abstractC6953uI1 : registrations) {
            for (Class<?> cls : abstractC6953uI1.getServices()) {
                if (this.serviceMap.containsKey(cls)) {
                    List<AbstractC6953uI1<?>> list = this.serviceMap.get(cls);
                    Intrinsics.checkNotNull(list);
                    list.add(abstractC6953uI1);
                } else {
                    this.serviceMap.put(cls, WE.h(abstractC6953uI1));
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1719Ou0
    @NotNull
    public <T> List<T> getAllServices(@NotNull Class<T> c) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(c, "c");
        synchronized (this.serviceMap) {
            try {
                arrayList = new ArrayList();
                if (this.serviceMap.containsKey(c)) {
                    Map<Class<?>, List<AbstractC6953uI1<?>>> map = this.serviceMap;
                    Intrinsics.checkNotNull(map);
                    List<AbstractC6953uI1<?>> list = map.get(c);
                    Intrinsics.checkNotNull(list);
                    for (AbstractC6953uI1<?> abstractC6953uI1 : list) {
                        Object objResolve = abstractC6953uI1.resolve(this);
                        if (objResolve == null) {
                            throw new Exception("Could not instantiate service: " + abstractC6953uI1);
                        }
                        arrayList.add(objResolve);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final /* synthetic */ <T> List<T> getAllServices$com_onesignal_core() {
        Intrinsics.h();
        throw null;
    }

    @Override // defpackage.InterfaceC1719Ou0
    public <T> T getService(@NotNull Class<T> c) throws Exception {
        Intrinsics.checkNotNullParameter(c, "c");
        T t = (T) getServiceOrNull(c);
        if (t != null) {
            return t;
        }
        throw new Exception("Service " + c + " could not be instantiated");
    }

    public final /* synthetic */ <T> T getService$com_onesignal_core() {
        Intrinsics.h();
        throw null;
    }

    @Override // defpackage.InterfaceC1719Ou0
    @Nullable
    public <T> T getServiceOrNull(@NotNull Class<T> c) {
        T t;
        AbstractC6953uI1 abstractC6953uI1;
        Intrinsics.checkNotNullParameter(c, "c");
        synchronized (this.serviceMap) {
            List<AbstractC6953uI1<?>> list = this.serviceMap.get(c);
            t = (list == null || (abstractC6953uI1 = (AbstractC6953uI1) CollectionsKt.L(list)) == null) ? null : (T) abstractC6953uI1.resolve(this);
        }
        return t;
    }

    public final /* synthetic */ <T> T getServiceOrNull$com_onesignal_core() {
        Intrinsics.h();
        throw null;
    }

    @Override // defpackage.InterfaceC1719Ou0
    public <T> boolean hasService(@NotNull Class<T> c) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(c, "c");
        synchronized (this.serviceMap) {
            zContainsKey = this.serviceMap.containsKey(c);
        }
        return zContainsKey;
    }

    public final /* synthetic */ <T> boolean hasService$com_onesignal_core() {
        Intrinsics.h();
        throw null;
    }
}
