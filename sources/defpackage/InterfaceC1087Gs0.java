package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: Gs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1087Gs0 {

    /* JADX INFO: renamed from: Gs0$a */
    public static final class a {
        public static /* synthetic */ Object delete$default(InterfaceC1087Gs0 interfaceC1087Gs0, String str, C3597ea1 c3597ea1, JM jm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 2) != 0) {
                c3597ea1 = null;
            }
            return interfaceC1087Gs0.delete(str, c3597ea1, jm);
        }

        public static /* synthetic */ Object get$default(InterfaceC1087Gs0 interfaceC1087Gs0, String str, C3597ea1 c3597ea1, JM jm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 2) != 0) {
                c3597ea1 = null;
            }
            return interfaceC1087Gs0.get(str, c3597ea1, jm);
        }

        public static /* synthetic */ Object patch$default(InterfaceC1087Gs0 interfaceC1087Gs0, String str, JSONObject jSONObject, C3597ea1 c3597ea1, JM jm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
            }
            if ((i & 4) != 0) {
                c3597ea1 = null;
            }
            return interfaceC1087Gs0.patch(str, jSONObject, c3597ea1, jm);
        }

        public static /* synthetic */ Object post$default(InterfaceC1087Gs0 interfaceC1087Gs0, String str, JSONObject jSONObject, C3597ea1 c3597ea1, JM jm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
            }
            if ((i & 4) != 0) {
                c3597ea1 = null;
            }
            return interfaceC1087Gs0.post(str, jSONObject, c3597ea1, jm);
        }

        public static /* synthetic */ Object put$default(InterfaceC1087Gs0 interfaceC1087Gs0, String str, JSONObject jSONObject, C3597ea1 c3597ea1, JM jm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
            }
            if ((i & 4) != 0) {
                c3597ea1 = null;
            }
            return interfaceC1087Gs0.put(str, jSONObject, c3597ea1, jm);
        }
    }

    @Nullable
    Object delete(@NotNull String str, @Nullable C3597ea1 c3597ea1, @NotNull JM<? super C5178lr0> jm);

    @Nullable
    Object get(@NotNull String str, @Nullable C3597ea1 c3597ea1, @NotNull JM<? super C5178lr0> jm);

    @Nullable
    Object patch(@NotNull String str, @NotNull JSONObject jSONObject, @Nullable C3597ea1 c3597ea1, @NotNull JM<? super C5178lr0> jm);

    @Nullable
    Object post(@NotNull String str, @NotNull JSONObject jSONObject, @Nullable C3597ea1 c3597ea1, @NotNull JM<? super C5178lr0> jm);

    @Nullable
    Object put(@NotNull String str, @NotNull JSONObject jSONObject, @Nullable C3597ea1 c3597ea1, @NotNull JM<? super C5178lr0> jm);
}
