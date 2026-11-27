package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: Pd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1746Pd0 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746Pd0(@NonNull String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
