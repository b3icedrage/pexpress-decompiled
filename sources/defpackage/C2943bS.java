package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2943bS {

    /* JADX INFO: renamed from: bS$b */
    public interface b<N> {
        @NotNull
        Iterable<? extends N> r(N n);
    }

    /* JADX INFO: renamed from: bS$c */
    public interface c<N, R> {
        R a();

        void b(N n);

        boolean c(N n);
    }

    /* JADX INFO: renamed from: bS$d */
    public static class d<N> {
        public final HashSet a = new HashSet();
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[0] = "neighbors";
                break;
            case 2:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 16:
            case 19:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(@NotNull List list, @NotNull b bVar, @NotNull a aVar) {
        if (list == null) {
            a(4);
            throw null;
        }
        d dVar = new d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c(it.next(), bVar, dVar, aVar);
        }
        return aVar.a();
    }

    public static void c(@NotNull Object obj, @NotNull b bVar, @NotNull d dVar, @NotNull a aVar) {
        if (obj == null) {
            a(22);
            throw null;
        }
        if (dVar.a.add(obj) && aVar.c(obj)) {
            Iterator it = bVar.r(obj).iterator();
            while (it.hasNext()) {
                c(it.next(), bVar, dVar, aVar);
            }
            aVar.b(obj);
        }
    }

    public static Boolean d(@NotNull List list, @NotNull b bVar, @NotNull Function1 function1) {
        if (list != null) {
            return (Boolean) b(list, bVar, new C2719aS(function1, new boolean[1]));
        }
        a(7);
        throw null;
    }

    /* JADX INFO: renamed from: bS$a */
    public static abstract class a<N, R> implements c<N, R> {
        @Override // defpackage.C2943bS.c
        public void b(N n) {
        }
    }
}
