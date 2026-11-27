package defpackage;

import java.util.Comparator;
import kotlin.text.Regex;

/* JADX INFO: renamed from: oJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5696oJ0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Regex regex = AbstractC5906pJ0.d;
        Integer numB = C5323mZ.b((AbstractC5533nZ) obj, (AbstractC5533nZ) obj2);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
