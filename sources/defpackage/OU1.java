package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface OU1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] g;

        static {
            a aVar = new a("OUR", 0);
            d = aVar;
            a aVar2 = new a("NOT_OUR", 1);
            e = aVar2;
            a[] aVarArr = {aVar, aVar2};
            g = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }
    }

    @Nullable
    Object a(@NotNull JM<? super CommonResult<?>> jm);

    @NotNull
    C1621Nn1 b();
}
