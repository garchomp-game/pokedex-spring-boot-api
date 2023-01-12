let SessionLoad = 1
let s:so_save = &g:so | let s:siso_save = &g:siso | setg so=0 siso=0 | setl so=-1 siso=-1
let v:this_session=expand("<sfile>:p")
silent only
silent tabonly
cd ~/workspace/pokemon_community_app/myapp
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
let s:shortmess_save = &shortmess
if &shortmess =~ 'A'
  set shortmess=aoOA
else
  set shortmess=aoO
endif
badd +1 ~/workspace/pokemon_community_app/myapp
badd +116 src/main/java/com/example/myapp/service/pokedex/PokedexService.java
badd +1 src/main/java/com/example/myapp/property/pokedex/status/Status.java
badd +4 src/main/java/com/example/myapp/property/pokedex/status/StatusBase.java
badd +1 src/main/resources/pokedex/pokedex/Red_Green_Blue_Yellow/Red_Green_Blue_Yellow.json
badd +66 src/main/java/com/example/myapp/controller/pokedex/PokedexController.java
badd +1 src/main/resources/pokedex/pokedex/Black2_White2/Black2_White2.json
badd +1 ~/workspace/pokemon_community_app/memo.txt
badd +74 ~/workspace/pokemon_community_app/memo.md
badd +1 src/main/java/com/example/myapp/controller/pokedex/StatusController.java
badd +67 src/main/java/com/example/myapp/service/pokedex/StatusService.java
badd +1 src/main/resources/pokedex/translate/translate.json
badd +1 src/main/resources/pokedex/type/list.json
badd +1 src/main/resources/pokedex/type/type.json
badd +1 src/main/resources/pokedex/pokedex/pokedex.json
badd +1 src/main/resources/pokedex/convert/local_global_id_converter.json
badd +3 src/main/java/com/example/myapp/property/pokedex/Pokedex.java
badd +1 src/main/resources/pokedex/pokedex/X_Y/X_Y.json
badd +27 src/main/java/com/example/myapp/service/pokedex/ConvertService.java
badd +4 src/main/java/com/example/myapp/property/convert/Convert.java
badd +3 src/main/java/com/example/myapp/property/convert/ConverterItem.java
badd +6 src/main/java/com/example/myapp/property/pokedex/status/PokemonStatus.java
argglobal
%argdel
set lines=49 columns=191
tabnew +setlocal\ bufhidden=wipe
tabrewind
edit src/main/java/com/example/myapp/service/pokedex/ConvertService.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd _ | wincmd |
split
1wincmd k
wincmd w
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe '1resize ' . ((&lines * 23 + 24) / 49)
exe 'vert 1resize ' . ((&columns * 95 + 95) / 191)
exe '2resize ' . ((&lines * 22 + 24) / 49)
exe 'vert 2resize ' . ((&columns * 95 + 95) / 191)
exe 'vert 3resize ' . ((&columns * 95 + 95) / 191)
argglobal
balt src/main/java/com/example/myapp/property/convert/Convert.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 27 - ((11 * winheight(0) + 11) / 23)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 27
normal! 021|
wincmd w
argglobal
if bufexists(fnamemodify("src/main/java/com/example/myapp/service/pokedex/PokedexService.java", ":p")) | buffer src/main/java/com/example/myapp/service/pokedex/PokedexService.java | else | edit src/main/java/com/example/myapp/service/pokedex/PokedexService.java | endif
if &buftype ==# 'terminal'
  silent file src/main/java/com/example/myapp/service/pokedex/PokedexService.java
endif
balt src/main/java/com/example/myapp/service/pokedex/ConvertService.java
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 107 - ((11 * winheight(0) + 11) / 22)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 107
normal! 018|
wincmd w
argglobal
if bufexists(fnamemodify("src/main/java/com/example/myapp/controller/pokedex/StatusController.java", ":p")) | buffer src/main/java/com/example/myapp/controller/pokedex/StatusController.java | else | edit src/main/java/com/example/myapp/controller/pokedex/StatusController.java | endif
if &buftype ==# 'terminal'
  silent file src/main/java/com/example/myapp/controller/pokedex/StatusController.java
endif
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 1 - ((0 * winheight(0) + 23) / 46)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 1
normal! 024|
wincmd w
3wincmd w
exe '1resize ' . ((&lines * 23 + 24) / 49)
exe 'vert 1resize ' . ((&columns * 95 + 95) / 191)
exe '2resize ' . ((&lines * 22 + 24) / 49)
exe 'vert 2resize ' . ((&columns * 95 + 95) / 191)
exe 'vert 3resize ' . ((&columns * 95 + 95) / 191)
tabnext
edit src/main/resources/pokedex/pokedex/X_Y/X_Y.json
argglobal
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 6158 - ((22 * winheight(0) + 23) / 46)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 6158
normal! 029|
tabnext 1
if exists('s:wipebuf') && len(win_findbuf(s:wipebuf)) == 0 && getbufvar(s:wipebuf, '&buftype') isnot# 'terminal'
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20
let &shortmess = s:shortmess_save
let s:sx = expand("<sfile>:p:r")."x.vim"
if filereadable(s:sx)
  exe "source " . fnameescape(s:sx)
endif
let &g:so = s:so_save | let &g:siso = s:siso_save
set hlsearch
nohlsearch
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :
