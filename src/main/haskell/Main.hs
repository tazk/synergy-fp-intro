module Main where

import Prelude hiding (map, filter)
import Data.Char (toUpper)
import Data.List (concat, replicate)

upperCaser :: String -> String
upperCaser s = map toUpper s

concatenator :: String -> Integer -> String
concatenator s n = concat (replicate n s)

hooray :: IO ()
hooray = putStrLn "Hooray!"

repeat :: IO a -> Integer -> IO ()
repeat act n = replicateM_ n act

map :: (a -> b) -> [a] -> [b]
map _ [] = []
map f (x:xs) = f x : map f xs

doubleIt :: Integer -> Integer
doubleIt = (* 2)

doubleAll :: [Integer] -> [Integer]
doubleAll xs = map doubleIt xs
-- eta reduction:
-- doubleAll = map doubleIt

filter :: (a -> Bool) -> [a] -> [a]
filter _ [] = []
filter f (x:xs) = if f x then x : filter pred xs
  | pred x         =
  | otherwise      = filter pred xs
filter f (x:xs) =