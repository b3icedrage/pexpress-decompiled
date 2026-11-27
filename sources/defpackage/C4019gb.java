package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4019gb implements InterfaceC4749jo0, WO1 {

    @NotNull
    public static final Object d = new Object();
    public static final /* synthetic */ C4019gb e = new C4019gb();

    public static void a(C7377wJ1 c7377wJ1) {
        c7377wJ1.a(AbstractC0666Bi.class, C1352Kc1.class, "layout");
        c7377wJ1.a(O92.class, C1352Kc1.class, "layout");
        c7377wJ1.a(AbstractC0666Bi.class, C1507Mc1.class, "encoder");
        c7377wJ1.a(O92.class, C1507Mc1.class, "encoder");
        c7377wJ1.a(W70.class, LD0.class, "evaluator");
        c7377wJ1.a(UB1.class, VB1.class, "ssl");
        c7377wJ1.a(VB1.class, WB1.class, "parameters");
        c7377wJ1.a(VB1.class, C6328rK0.class, "keyStore");
        c7377wJ1.a(VB1.class, C6328rK0.class, "trustStore");
        c7377wJ1.a(VB1.class, C5066lK0.class, "keyManagerFactory");
        c7377wJ1.a(VB1.class, C6071q52.class, "trustManagerFactory");
        c7377wJ1.a(VB1.class, C7572xE1.class, "secureRandom");
    }

    @NotNull
    public static LinkedHashMap c(@NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return PW0.l(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // defpackage.WO1
    public StackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i2 = 1;
                i = i3;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i3 - iIntValue;
            if (i3 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i3 - num.intValue();
                        if (i2 < 10) {
                            System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, iIntValue2);
                            i4 += iIntValue2;
                            i2++;
                        }
                        i = (iIntValue2 - 1) + i3;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i3 + i6])) {
                        stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                        i4++;
                        i2 = 1;
                        i = i3;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i2 = 1;
                i = i3;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i4);
        return i4 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }
}
