package defpackage;

import io.sentry.protocol.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6740tH1 {

    @NotNull
    public final C2688aH1 a;

    public C6740tH1(@NotNull C2688aH1 c2688aH1) {
        this.a = c2688aH1;
    }

    @Nullable
    public static Boolean c(@Nullable String str, @NotNull List<String> list, @NotNull List<String> list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    @NotNull
    public final List<y> a() {
        ArrayList arrayListB = b(new Exception().getStackTrace(), false);
        if (arrayListB == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(arrayListB.size());
        for (Object obj : arrayListB) {
            if (Boolean.TRUE.equals(((y) obj).o)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayListB.size());
        for (Object obj2 : arrayListB) {
            String str = ((y) obj2).j;
            if (str == null || (!str.startsWith("sun.") && !str.startsWith("java.") && !str.startsWith("android.") && !str.startsWith("com.android."))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Nullable
    public final ArrayList b(@Nullable StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    y yVar = new y();
                    C2688aH1 c2688aH1 = this.a;
                    yVar.o = c(className, c2688aH1.getInAppIncludes(), c2688aH1.getInAppExcludes());
                    yVar.j = className;
                    yVar.i = stackTraceElement.getMethodName();
                    yVar.h = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        yVar.k = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    yVar.q = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(yVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
