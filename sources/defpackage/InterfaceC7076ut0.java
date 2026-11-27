package defpackage;

import defpackage.D01;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: ut0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7076ut0<TModel extends D01> extends InterfaceC0775Cs0<InterfaceC7286vt0<TModel>> {
    void add(int i, @NotNull TModel tmodel, @NotNull String str);

    void add(@NotNull TModel tmodel, @NotNull String str);

    void clear(@NotNull String str);

    @Nullable
    TModel create(@Nullable JSONObject jSONObject);

    @Nullable
    TModel get(@NotNull String str);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ boolean getHasSubscribers();

    @NotNull
    Collection<TModel> list();

    void remove(@NotNull String str, @NotNull String str2);

    void replaceAll(@NotNull List<? extends TModel> list, @NotNull String str);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void subscribe(Object obj);

    @Override // defpackage.InterfaceC0775Cs0
    /* synthetic */ void unsubscribe(Object obj);

    /* JADX INFO: renamed from: ut0$a */
    public static final class a {
        public static /* synthetic */ void add$default(InterfaceC7076ut0 interfaceC7076ut0, D01 d01, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
            }
            if ((i & 2) != 0) {
                str = "NORMAL";
            }
            interfaceC7076ut0.add(d01, str);
        }

        public static /* synthetic */ void clear$default(InterfaceC7076ut0 interfaceC7076ut0, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clear");
            }
            if ((i & 1) != 0) {
                str = "NORMAL";
            }
            interfaceC7076ut0.clear(str);
        }

        public static /* synthetic */ D01 create$default(InterfaceC7076ut0 interfaceC7076ut0, JSONObject jSONObject, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i & 1) != 0) {
                jSONObject = null;
            }
            return interfaceC7076ut0.create(jSONObject);
        }

        public static /* synthetic */ void remove$default(InterfaceC7076ut0 interfaceC7076ut0, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
            }
            if ((i & 2) != 0) {
                str2 = "NORMAL";
            }
            interfaceC7076ut0.remove(str, str2);
        }

        public static /* synthetic */ void replaceAll$default(InterfaceC7076ut0 interfaceC7076ut0, List list, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceAll");
            }
            if ((i & 2) != 0) {
                str = "NORMAL";
            }
            interfaceC7076ut0.replaceAll(list, str);
        }

        public static /* synthetic */ void add$default(InterfaceC7076ut0 interfaceC7076ut0, int i, D01 d01, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
            }
            if ((i2 & 4) != 0) {
                str = "NORMAL";
            }
            interfaceC7076ut0.add(i, d01, str);
        }
    }
}
