package defpackage;

import com.base.feature.support.support.screens.issue_categories.SupportIssueCategoriesPartBase;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class B3 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B3(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Wd2) ((A3) this.e).invoke();
            case 1:
                File file = (File) ((Function0) this.e).invoke();
                if (Intrinsics.a(C6179qd0.e(file), "preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            default:
                return (SupportIssueCategoriesPartBase) this.e;
        }
    }
}
