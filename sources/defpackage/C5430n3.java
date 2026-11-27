package defpackage;

import com.base.feature.webpage.screens.knowledgeBase.KnowledgeBaseFragmentBase;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5430n3 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5430n3(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        switch (this.d) {
            case 0:
                return (Wd2) ((C5220m3) this.e).invoke();
            case 1:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            case 2:
                C3608ed0 c3608ed0 = ((IS) this.e).a;
                File file = ((File) c3608ed0.c.invoke()).getCanonicalFile();
                synchronized (C3608ed0.e) {
                    String path = file.getAbsolutePath();
                    LinkedHashSet linkedHashSet = C3608ed0.d;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Intrinsics.checkNotNullExpressionValue(path, "path");
                    linkedHashSet.add(path);
                }
                Intrinsics.checkNotNullExpressionValue(file, "file");
                return new C4238hd0(file, c3608ed0.a, c3608ed0.b.invoke(file), new C3399dd0(file, 0));
            case 3:
                return (KnowledgeBaseFragmentBase) this.e;
            case 4:
                return (Wd2) ((C5220m3) this.e).invoke();
            default:
                La2 la2 = (La2) this.e;
                int iF = StringsKt.F('/', la2.a.a.length() + 3, 4, la2.h);
                if (iF == -1) {
                    return "";
                }
                String str = la2.h;
                int iF2 = StringsKt.F('#', iF, 4, str);
                if (iF2 == -1) {
                    String strSubstring = str.substring(iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return strSubstring;
                }
                String strSubstring2 = str.substring(iF, iF2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
        }
    }
}
